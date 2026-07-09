class Solution {
    public String simplifyPath(String path) {
    Deque<String> stack = new ArrayDeque<>();
    String[] components = path.split("/");
    for (String component : components) {
        if (component.isEmpty() || component.equals(".")) {
                continue;
            }
        if (component.equals("..")) {
        
                stack.pollLast();
            } else {
                
                stack.offerLast(component);
            }
    }
     return "/" + String.join("/", stack);
}



}