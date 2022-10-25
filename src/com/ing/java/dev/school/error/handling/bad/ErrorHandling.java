package com.ing.java.dev.school.error.handling.bad;

public class ErrorHandling {

    int findPositionOfValueInArray(int value, int[] array) {
        if (array == null) return -3;
        if (array.length == 0) return -2;
        // find pos of val and return pos
        //...... actual implementation.......
        // if not found
        return -1;
    }

    void displayPosition(int value, int[] array) {
        int pos = findPositionOfValueInArray(value, array);
        if (pos == -3) {
            // process error recovery
        } else if (pos == -2) {
            // process error recovery
        } else if (pos == -1) {
            // process error recovery
        } else {
            System.out.println(pos);
        }
    }


    // 2. don't return null;

    public User createUser(User user){

        if(loadUser(user.getId()) instanceof User){
            // user already exists
            return null;
        };

        return userRepository.save(user);
    }
}
