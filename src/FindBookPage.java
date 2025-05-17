public class FindBookPage {
    public static void main(String[] aStrings) {
        int totalPage = 6;
        int targetPage = 3;

        int spreadFromStart = targetPage % 2 == 0 ? targetPage / 2 : (targetPage - 1) / 2;
        int spreadFromEnd = ((totalPage % 2 == 0) ? totalPage /2 : (totalPage - 1) / 2) - spreadFromStart;


        if(spreadFromStart < spreadFromEnd) { // to find minimum turn pages
        System.out.println(spreadFromStart);
        }else {
            System.out.println(spreadFromEnd);
        }
    }
}