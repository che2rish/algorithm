package section7;

// 이진트리
// 전위순회 - 루트 노드 -> 왼쪽 서브 트리 -> 오른쪽 서브트리
// 중위순회 - 왼쪽 서브트리 -> 루트 노드 -> 오른쪽 서브트리
// 후위순회 - 왼쪽 서브트리 -> 오른쪽 서브트리 -> 루트 노드

class Node{
    int data; // 데이터 저장
    Node lt, rt; // 왼쪽, 오른쪽 노드 저장
    public Node(int val){ // val = 1,2,3,4,5 ...
        data = val;
        lt = rt = null;
    }
}

public class ex05 {
    Node root;
    public void DFS(Node root){
        if(root == null)
            return;
        else{
//            System.out.print(root.data+" "); // 전위순회
            DFS(root.lt);
//            System.out.print(root.data+" "); // 중위순회 -> 부모를 중간에서 방문한다?
            DFS(root.rt);
            System.out.print(root.data+" "); // 후위순회
        }
    }

    public static void main(String[] args){
        ex05 tree = new ex05();
        tree.root = new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        tree.root.rt.lt=new Node(6);
        tree.root.rt.rt=new Node(7);
        tree.DFS(tree.root);
    }
}
