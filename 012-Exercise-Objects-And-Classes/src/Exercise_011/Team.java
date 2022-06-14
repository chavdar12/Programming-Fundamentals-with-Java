package Exercise_011;

import java.util.List;

public class Team {

    private String name;
    private List<String> members;

    public Team(String name, List<String> members) {
        this.name = name;
        this.members = members;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public int membersCount() {
        return members.size();
    }


    public String getMember(int i) {
        return members.get(i);
    }
}