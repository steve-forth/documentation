import com.datadog.api.v1.client.api.WebhooksIntegrationApi;

public class WebhooksIntegrationApiExample {

    public static void main(String[] args) {
        WebhooksIntegrationApi apiInstance = new WebhooksIntegrationApi();
        WebhooksIntegrationCustomVariable body = ; // WebhooksIntegrationCustomVariable | 
        try {
            WebhooksIntegrationCustomVariable result = apiInstance.createWebhooksIntegrationCustomVariable(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksIntegrationApi#createWebhooksIntegrationCustomVariable");
            e.printStackTrace();
        }
    }
}