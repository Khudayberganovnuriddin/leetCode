package leetCode.WixEngineering.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        for (Node curr = head; curr != null; curr = curr.next) {
            map.put(curr, new Node(curr.val));
        }
        for (Node curr = head; curr != null; curr = curr.next) {
            Node cloneNode = map.get(curr);
            cloneNode.next = map.get(curr.next);
            cloneNode.random = map.get(curr.random);
        }
        return map.get(head);
    }
}
