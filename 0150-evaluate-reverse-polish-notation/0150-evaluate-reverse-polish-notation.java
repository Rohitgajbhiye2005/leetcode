class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> res=new Stack<>();
        for(String token : tokens){
            if(operator(token)){
                int b=res.pop();
                int a=res.pop();
                int result=operation(a,b,token);
                res.push(result);
            }else{
                 res.push(Integer.parseInt(token));
            }
        }
        return res.pop();
    }
    private boolean operator(String token){
         return "+-*/".contains(token);
    }
     private int operation(int a, int b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b; 
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
     }
}