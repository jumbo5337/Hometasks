package Java1.structure;

public class List extends AbsStructure {
    private int size;
    private Element head;

    @Override
    public void add(int value) {
        Element el=new Element(value);
        if (head==null){
            head=el;
        }else{
            Element current=head;
            while (current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(el);
        }
        size++;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void remove(int index) {
        Element first = head;
        Element second = first.getNext();
        Element third=second.getNext();

        if (index==1){
            head=second;
        } else {
            int i=0;
            while (third.getNext()!=null){
                first=first.getNext();
                second=second.getNext();
                third=third.getNext();
                i++;
                if (i==index){ break;}
            }
            if(third.getNext()==null){
                second.setNext(null);
            } else {
                first.setNext(third);
            }
        }
    }






    @Override
    public void print() {
        Element first=head;
        System.out.println(first.getValue());
        Element second=first.getNext();
        System.out.println(second.getValue());
        while (second.getNext()!=null) {
            second=second.getNext();
            System.out.println(second.getValue());
        }

    }

    @Override
    public String toString() {
        Element current = head;
        String result = "";
        do {
            result += Integer.toString(current.getValue()) + ", ";
            current = current.getNext();
        } while (current.getNext()!=null);
          result=result+Integer.toString(current.getValue()) + ";";

        return result;
    }

    public class Element {
        private int value;
        private Element next;

        public Element(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setNext(Element element) {
            this.next = element;
        }

        public Element getNext() {
            return next;
        }

    }

}
