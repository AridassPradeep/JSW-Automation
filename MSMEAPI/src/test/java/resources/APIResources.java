package resources;


public enum APIResources {
	
    notificationRegistrationsmsAPI("/notification/sms/send"),
    notificationEmailAPI("/notification/email/send/order"),
	addToCartAPI("/cart/addtocart");
	private String resource;
	
	APIResources(String resource)
	{
		this.resource=resource;
	}
	
	public String getResource()
	{
		return resource;
		
	}
}
	