# Javablox
Developed by [TCLRainbow](https://github.com/TCLRainbow)

[This library is based on this endpoint list](https://github.com/AntiBoomz/BTRoblox/blob/master/README.md#api-docs)

TCLRainbow Discord: [![TCLRainbow discord](https://img.shields.io/discord/285366651312930817.svg)](https://discord.gg/6PjhjCD)

Largest Roblox API Discord community: [![Largest Roblox API Discord](https://img.shields.io/discord/332692436478590986.svg?style=popout)](https://discord.gg/EDXNdAT)

Travis CI: [![Build Status](https://travis-ci.org/RbxAPI/Javablox.svg?branch=master)](https://travis-ci.org/RbxAPI/Javablox)

# Library Architecture
## 1. API (javablox-api)
Javablox is now built ontop of Retrofit 2. All APIs are interfaces declared as [Retrofit Calls](https://square.github.io/retrofit/).

## 2. Implementation (javablox-endpoint)
Uses `call.enqueue` to get response (includes 4xx Status Code). When error, parse, generate  and throw `JavabloxException[]`

## 3. Instance-based
`User user = new User(String username, String password);` for login

## 4. Future events
`Future<void> onLoginSuccesful`

# New models
* User
  * Authenticated User
* Place
* Universe
* Avatar
* Asset
* Badge
* Conversation
  * Party