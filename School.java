import java.util.ArrayList;
import java.util.List;

class School {
    private List<Person> members;

    public School() {
        this.members = new ArrayList<>();
    }

    public void addMember(Person person) {
        members.add(person);
    }

    public void printMembers() {
        for (Person member : members) {
            System.out.println(member);
        }
    }
}