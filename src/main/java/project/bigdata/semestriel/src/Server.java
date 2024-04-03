package project.bigdata.semestriel.src;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;
@Getter
@Setter
@Node("Server")
public class Server {
    @Id
    private final String uri; // (1)
    private final String title;
    @Property("registrations")
    private final Boolean registrationsAllowed;
    @Property("short_description")
    private final String shortDescription;
    @Relationship("CONNECTED_TO")
    private List<Server> connectedServers;

    public Server(String uri, String title, Boolean registrationsAllowed, String shortDescription) {
        this.uri = uri;
        this.title = title;
        this.registrationsAllowed = registrationsAllowed;
        this.shortDescription = shortDescription;
    }
    // constructor, etc.
}