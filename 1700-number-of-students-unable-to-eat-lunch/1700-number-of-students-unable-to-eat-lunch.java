class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
         Queue<Integer> q = new LinkedList<>();
    int top = 0, count = 0;//top points to the current sandwich

    for(int e : students)
        q.add(e);

    while(!q.isEmpty() && count != q.size()){// count keeps the track of students processed in continuous manner 
        if(q.peek() == sandwiches[top]) {//if student at front can eat the sandwich at top
            count = 0;
            top++;//increment top pointer
            q.poll();
        } else {
            q.add(q.poll());//move the student to the rear
            count++;
        }
    }
    return q.size();
    }
}