package io.github.rbxapi.javablox.api.billing;

/**
 * https://billing.roblox.com/docs#/Payments
 */
public interface Payment {

    /**
     * Retrieve the payment history for Authenticated user
     * https://billing.roblox.com/docs#!/Payments/get_v1_user_payments
     *
     * @param sortOrder (asc/desc) Sorted by paymentDate
     * @param limit     (enum) The amount of results per request.
     * @param cursor    The paging cursor for the previous or next page.
     * @return {
     * "previousPageCursor": "string",
     * "nextPageCursor": "string",
     * "data": [
     * {
     * "paymentDate": "2018-09-09T04:05:08.705Z",
     * "products": [
     * {
     * "name": "string"
     * }
     * ],
     * "money": {
     * "Amount": 0,
     * "USDAmount": 0,
     * "Currency": {
     * "Id": 0,
     * "CurrencyType": "USD",
     * "CurrencyName": "string",
     * "CurrencySymbol": "string"
     * }
     * },
     * "paymentProviderType": "AppleAppStore",
     * "creditCardType": "Visa",
     * "cardNumber": "string"
     * }
     * ]
     * }
     */
    String getPaymentHistory(String sortOrder, int limit, String cursor);
}
