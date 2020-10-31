package restapi.security;

public class SecurityConstants {
	
	public static final String SECRET = "mk8Kjjf82pox";
	public static final long EXPIRATION_TIME = 86_400_000; //1 day
	public static final String TOKEN_PREFIX = "Bearer";
	public static final String HEADER_STRING = "Authorization";
	public static final String SIGN_UP_URL = "/users/signup";
	
}
