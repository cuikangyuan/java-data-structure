package LinkList;

public class LinkList {

    private Link first;


    public void LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertIntoFirstPos(int id, double dd) {
        Link newLink = new Link(id, dd);
        newLink.next = first;
        first = newLink;
    }


    public Link deleteFirst() {
        Link temp = null;

        if (!isEmpty()) {
            temp = first;
            first = temp.next;
        }

        return temp;
    }

    public void displayList() {
        System.out.print("List first --> last");

        Link current = first;

        while (current != null) {
            current.displayLink();
            current = current.next;
        }

        System.out.println(" ");
    }
}
