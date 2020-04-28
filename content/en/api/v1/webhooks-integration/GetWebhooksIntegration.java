import com.datadog.api.v1.client.api.WebhooksIntegrationApi;

public class WebhooksIntegrationApiExample {

    public static void main(String[] args) {
        WebhooksIntegrationApi apiInstance = new WebhooksIntegrationApi();
        String webhookName = webhookName_example; // String | The name of the webhook.
        try {
            WebhooksIntegration result = apiInstance.getWebhooksIntegration(webhookName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksIntegrationApi#getWebhooksIntegration");
            e.printStackTrace();
        }
    }
}