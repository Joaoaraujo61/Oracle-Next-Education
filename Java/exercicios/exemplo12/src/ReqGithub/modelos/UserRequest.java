package ReqGithub.modelos;

public record UserRequest(String name, String location, String bio, int followers, int following) {
}
