package TeamworkProjects;

import java.util.List;

public class Team {
    private String name;
    private String creator;
    private List<String> members;

    public Team(String name, String creator, List<String> members) {
        this.name = name;
        this.creator = creator;
        this.members = members;
    }

    public Team(String teamName, String creator) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }
}