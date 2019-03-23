public class Liste {

    Knude head = null;
    Knude tail = null;


    public void insertFromHead(Knude k) {

        // listen er tom
        if (head == null) {
            head = k;
            tail = k;

        } else {

            // hvis liste ikke er tom;
            k.next = head;
            head.previous = k;
            head = k;
        }


    }

    public void insertFromTail(Knude k) {

        if (tail == null) {

            tail = k;
            head = k;
        } else {

            tail.next = k;
            k.previous = tail;
            tail = k;

        }


    }


    public void printFromHead() {

        Knude k = head;

        while (k != null) {

            System.out.println(k.getNavn());

            k = k.next;
        }


    }

    public void printFromTail() {

        Knude k = tail;

        while (k != null) {

            System.out.println(k.getNavn());
            k = k.previous;
        }


    }

    public void removeFromHead() {

        if (head == null) {
            return;
        } else if (head == tail) {

            head = null;
            tail = null;

        } else {

            head.next.previous = null;
            head = head.next;
        }


    }


}
