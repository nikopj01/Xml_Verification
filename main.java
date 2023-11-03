public class main {
    public static void main(String[] args) {
        // String xml = "<html><tag></tag></html>";
        // String xml = "<Design><Code>hello world</Code></Design>";
        // String xml = "<Design><Code>hello world</Code></Design><People>";
        // String xml = "<People><Design><Code>hello world</People></Code></Design>";
        // String xml = "<People age=”1”>hello world</People>";
        String xml = "<Design><Code></Code><Code></Code></Design>";
        System.out.println("XML String: " + xml);
        System.out.println("Result: " + String.valueOf(DetermineXml(xml)));
    }

    static boolean DetermineXml(String xml) {
        Stack myStack = new Stack();
        for (String tag : xml.split("<")) {
            if (tag.length() == 0) {
                continue;
            }
            String refinedTag = tag.substring(0, tag.indexOf(">") + 1);

            // Opening
            if (!refinedTag.contains("/")) {
                myStack.Push(refinedTag);
            }
            // Ending
            else {
                String topItem = myStack.Peek().value;
                String finalCompare = refinedTag.replace("/", "");
                // Same as top item
                if (topItem.equals(finalCompare)) {
                    myStack.Pop();
                }
            }
        }
        if (myStack.length == 0) {
            return true;
        }
        return false;
    }
}