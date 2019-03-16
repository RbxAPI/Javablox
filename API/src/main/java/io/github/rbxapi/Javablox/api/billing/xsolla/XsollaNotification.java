package io.github.rbxapi.javablox.api.billing.xsolla;

/**
 * https://billing.roblox.com/docs#/Notifications
 */
public interface XsollaNotification {

    /**
     * Webhook for Xsolla
     * https://billing.roblox.com/docs#!/Notifications/post_v1_notifications_xsolla
     * @param xsollaNotificationModel {
     *   "notification_type": "string",
     *   "purchase": {
     *     "virtual_currency": {
     *       "name": "string",
     *       "quantity": 0,
     *       "currency": "string",
     *       "amount": 0,
     *       "sku": "string"
     *     },
     *     "virtual_items": {
     *       "items": [
     *         {
     *           "sku": "string",
     *           "amount": 0
     *         }
     *       ],
     *       "currency": "string",
     *       "amount": 0
     *     },
     *     "checkout": {
     *       "currency": "string",
     *       "amount": 0
     *     },
     *     "subscription": {
     *       "subscription_id": 0,
     *       "plan_id": "string",
     *       "product_id": "string",
     *       "date_create": "2018-09-09T04:27:24.085Z",
     *       "date_end": "2018-09-09T04:27:24.085Z",
     *       "currency": "string",
     *       "amount": 0
     *     },
     *     "total": {
     *       "currency": "string",
     *       "amount": 0
     *     }
     *   },
     *   "user": {
     *     "id": "string",
     *     "ip": "string",
     *     "phone": "string",
     *     "email": "string",
     *     "country": "string"
     *   },
     *   "transaction": {
     *     "id": 0,
     *     "external_id": "string",
     *     "payment_date": "2018-09-09T04:27:24.085Z",
     *     "payment_method": 0,
     *     "dry_run": 0
     *   },
     *   "payment_details": {
     *     "payment": {
     *       "currency": "string",
     *       "amount": 0
     *     },
     *     "payment_method_sum": {
     *       "currency": "string",
     *       "amount": 0
     *     },
     *     "xsolla_balance_sum": {
     *       "currency": "string",
     *       "amount": 0
     *     },
     *     "payout": {
     *       "currency": "string",
     *       "amount": 0
     *     },
     *     "xsolla_fee": {
     *       "currency": "string",
     *       "amount": 0
     *     },
     *     "payment_method_fee": {
     *       "currency": "string",
     *       "amount": 0
     *     },
     *     "vat": {
     *       "currency": "string",
     *       "amount": 0
     *     },
     *     "sales_tax": {
     *       "currency": "string",
     *       "amount": 0
     *     },
     *     "payout_currency_rate": "string"
     *   },
     *   "refund_details": {
     *     "code": 0,
     *     "reason": "string"
     *   },
     *   "custom_parameters": {
     *     "user_id": 0,
     *     "payment_method": 0,
     *     "account_id": 0,
     *     "checkout_session_id": 0,
     *     "main_product": 0,
     *     "main_product_price": 0,
     *     "upsell_product": 0,
     *     "upsell_product_price": 0,
     *     "total_price": 0,
     *     "currency": "string",
     *     "transaction_time": "2018-09-09T04:27:24.085Z",
     *     "ip_address": "string",
     *     "price_country_id": 0
     *   }
     * }
     * @return {}
     */
    String triggerWebhook(String xsollaNotificationModel);
}
