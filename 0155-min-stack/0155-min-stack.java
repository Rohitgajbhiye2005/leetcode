import java.util.Stack;

class MinStack {
    private Stack<Long> st;
    private long mini;

    public MinStack() {
        st = new Stack<>();
        mini = Long.MAX_VALUE;
    }

    public void push(int val) {
        long value = val;
        if (st.isEmpty()) {
            st.push(value);
            mini = value;
        } else {
            if (value < mini) {
                st.push(2 * value - mini);
                mini = value;
            } else {
                st.push(value);
            }
        }
    }

    public void pop() {
        if (st.isEmpty()) return;

        long val = st.pop();
        if (val < mini) {
            mini = 2 * mini - val;
        }
    }

    public int top() {
        long val = st.peek();
        if (val < mini) {
            return (int) mini;
        }
        return (int) val;
    }

    public int getMin() {
        return (int) mini;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
