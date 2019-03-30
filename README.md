# Javablox
Developed by [TCLRainbow](https://github.com/TCLRainbow)

[This library is based on this endpoint list](https://github.com/AntiBoomz/BTRoblox/blob/master/README.md#api-docs)

TCLRainbow Discord: [![TCLRainbow discord](https://img.shields.io/discord/285366651312930817.svg)](https://discord.gg/6PjhjCD)

Largest Roblox API Discord community: [![Largest Roblox API Discord](https://img.shields.io/discord/332692436478590986.svg?style=popout)](https://discord.gg/EDXNdAT)

Travis CI: [![Build Status](https://travis-ci.org/RbxAPI/Javablox.svg?branch=master)](https://travis-ci.org/RbxAPI/Javablox)

# Pipeline
Javablox works in the following way:
* Request data from URL by methods
* Parse or serialise the data, depends on how the programmer wants the library to work
* Return values from the HTTP Response or throw exceptions
**NOTE:** This library prefers "async all the way", therefore ``CompletableFuture<>`` is used.

# Library Architecture
## 1. Core Level: HTTP Layer
The lowest level code in Javablox is interfaces that are compromised with AntiBoomz's API list in mind. Basically these are methods that will return `String`. The `String` is pure HTTP Response formatted in JSON, and is usually useless when manipulated alone. 
* For programmers that want to get useful data, you should at least use the library with the 3rd layer as well
* For programmers that want to control how HTTP responses are processed, you need to make a custom implementation of this layer.

```java
// Example Roblox Endpoint declaration
public interface UserService {
/** HTTP GET
 *  @return {"username": "Pythonic-Rainbow"}
**/
CompletableFuture<String> getUsername(double userId);

/** HTTP POST
 *  @return {} (Usually HTTP Status Code, empty object often means successful POST)
**/
CompletableFuture<String> setUsername(String username, double userId);
}
```

## 2. Implementation Level: Endpoint Layer
This layer implements APIs in the previous layer.

Because endpoints will not change, it is recommended to code in `static`.
* Programmers can write their own client code, and then use the roblox endpoints with it
* Or, if they think some client is good enough, and wish to alternate how it works with the endpoint, they can simply code a `Data type layer` that utilizes existing clients.


```java
// Example Endpoint Handler
// Defines how a HTTP Client works
public class ClientHandler {
    private SomeHTTPClient client = new SomeHTTPClient();

    @Override
    CompletableFuture<String> get(String filledUrl) {
        return client.getAsync(filledUrl);
    }

    @Override
    CompletableFuture<String> post(String filledUrl) {
        return client.postAsync(filledUrl);
    }
}
```
After the client is defined, we will implement the API.
```java
// Example Javablox API implementation
public class UserEndpoint implements User {
    @Override
    CompletableFuture<String> getUsername(double userId) {
        return ClientHandler.get(MessageFormat.format("https://user.roblox.com/getuser?userid={0}", userid)); // return "Pythonic-Rainbow"
    }

    // It is common for POST methods to return updated value (if available) when the request is success.
    // If the request failed, you can return the original value or simply an empty string.
    @Override
    CompletableFuture<String> setUsername(String username, double userId) {
        return ClientHandler.post(MessageFormat.format("https:/user.roblox.com/setusername?userid={0}&username={1}", userId, username));
    }
}
```

## 3. Control Level: Data Type Layer
This layer consist of codes that are ~~actually meaningful~~ high level enough for programmers wish to interact with the Roblox endpoint at ease. It works by implementing the Endpoint Layer, then with a chosen HTTP client, convert `String` to different data type. The convertion method will vary.

The main difference between this layer and the Endpoint Layer is that we will parse HTTP responses(JSON) here, as well as throwing exceptions.

Javablox ships with a default implementation that uses `java.net.http` HTTP Client [(Built in with Java 11)](https://openjdk.java.net/groups/net/httpclient/intro.html) and [`org.json`](https://stleary.github.io/JSON-java/) convertion library.

```java
// Example Javablox API implementation
public class UserService {
    private static UserEndpoint user = new UserEndpoint();

    CompletableFuture<String> getUsername(double userId) throws JavabloxExceptionA, JavabloxExceptionB {
        JSON j = JSON.parse(user.getUsername(userId));
        if j.has("error") {
            //throw multiple exceptions
            return "";
        } else {
            return j.getString("name") // return "Pythonic-Rainbow"
        } 
    }

    // It is common for POST methods to return updated value (if available) when the request is success.
    // If the request failed, you can return the original value or simply an empty string.
    @Override
    CompletableFuture<String> setUsername(String username, double userId) {
        String response = EndpointHandler.post(MessageFormat.format("https:/user.roblox.com/setusername?userid={0}&username={1}", userId, username));
        if (response == "{}") return getUsername(userId);
        return username;
    }
}
```

## 4. Optional Level: Extension Layer
While Javablox only requires the above layers to work, it only provides fundamental endpoint interactions. As the highest level layer, this provides some optional features.
* This layer should **NOT** be customized in any way.

Here is some extensions that ships by default with Javablox:

### Entity-oriented
Unlike other layers, this layer focuses on entity rather than  endpoint

For example, `Data Type Layer` has a code tree similar to this
* Endpoints
  * Auth
  * GameInternalization
  * Notification
  * Locale
  * Billing
These are list of services provided by the Roblox Endpoint.

But in `Extension Layer`, we code in this way:
* Entities
  * User
  * Game
  * Group
  * Universe

Instead of using services, which are static(becuz they won't change), entities are instances. You can create an instance and call methods from them
```java
//Example Entity
public class User {
    private int userId;
    private String username;

    public User(int userId) {
        this.userId = userId;
        this.username = UserEndpoint.getUsername(userId);
    }
}
```

### Event sub-system
Javablox also has a event system. This are events that can be subscribed whenever roblox interupts occured.
More details will be provided in the future.
```java
// Example event system
public void onLogin(User user) {
    System.out.print("You logged in!");
    System.out.print(MessageFormat.format("Username:{0}", user.username));
}
```