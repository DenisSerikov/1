package HashTable;
public class HTable implements Table<Integer, String> {
    private final int INIT_SIZE = 16;
    private Node[] array = new Node[INIT_SIZE];

    private int pointer = 0;

    public static class Node {
        public String value;
        public Integer key;
        public boolean read;
        public Node next;

        public Node(int key, String value, boolean read) {
            this.value = value;
            this.key = key;
            this.read = read;
            next = null;
        }
    }

    public void put(int key, String value) {
        int keyForArray = (Math.abs(list.key.hashCode()) % newArray.length);
        Node newNode = new Node(key, value, true);
        if (array[keyForArray] != null) {
            Node correntNode = array[keyForArray];
            while (correntNode.next != null) {
                correntNode = correntNode.next;
            }
            correntNode.next = newNode;
        } else {
            array[keyForArray] = newNode;
        }
        pointer++;
        if (pointer == array.length * 0.75)
            resize();
    }

    public String get(int key) {
        StringBuilder result = new StringBuilder();
        int keyForArray = (Math.abs(list.key.hashCode()) % newArray.length);
        Node currentNode = array[keyForArray];
        if (currentNode.next == null) {
            result = new StringBuilder(currentNode.value);
        } else {
            while (currentNode.next != null) {
                if (currentNode.key == key) {
                    result.append(currentNode.value);
                    return result.toString();
                }
                currentNode = currentNode.next;
            }
            if (currentNode.key == key) {
                result.append(currentNode.value);
            }
        }
        return result.toString();
    }

    public void remove(int key) {
        int keyForArray = (Math.abs(list.key.hashCode()) % newArray.length);
        Node correntNode = array[keyForArray];
        if (correntNode.key == key) {
            correntNode.read = false;
            if (correntNode.next != null) {
                while (correntNode.next != null) {
                    correntNode = correntNode.next;
                    if (correntNode.key == key) {
                        correntNode.read = false;
                    }
                }
            }
        } else {
            if (correntNode.next != null) {
                while (correntNode.next != null) {
                    correntNode = correntNode.next;
                    if (correntNode.key == key) {
                        correntNode.read = false;
                    }
                }
            }
        }
    }

    public int size() {
        return pointer;
    }

    private void resize() {
        Node[] newArray = new Node[array.length * 2];
        for (Node node : array) {
            Node list = node;
            while (list != null) {
                Node next = list.next;
                int trickyHash = (Math.abs(list.key.hashCode()) % newArray.length);
                list.next = newArray[trickyHash];
                newArray[trickyHash] = list;
                list = next;
            }
        }
        array = newArray;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                Node currentNode = array[i];
                while (currentNode.next != null) {
                    if (currentNode.read) {
                        result.append(currentNode.value).append("\n");
                    }
                    currentNode = currentNode.next;
                }
                if (currentNode.read) {
                    result.append(currentNode.value).append("\n");
                }
            }
        }
        return result.toString();
    }
}
