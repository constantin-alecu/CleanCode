package com.ing.java.dev.school.error.handling.good;

public class ErrorHandling {

    int findPositionOfValueInArray(int value, int[] array) throws NullArrayException, EmptyArrayException, ValueNotFoundException {
        if (array == null) {
            throw new NullArrayException();
        }
        if (array.length == 0) {
            throw new EmptyArrayException();
        }
        // find pos of val and return pos
        // return position
        // if not found
        throw new ValueNotFoundException();
    }

    void displayPosition(int value, int[] array) {
        int pos = 0;
        try {
            pos = findPositionOfValueInArray(value, array);
        } catch (NullArrayException e) {
            // process error recovery
        } catch (EmptyArrayException e) {
            // process error recovery
        } catch (ValueNotFoundException e) {
            // process error recovery
        }
        System.out.println(pos);
    }


    // 2. don't return null;
    public User createUser(User user){

        if(loadUser(user.getId()) instanceof User){
            throw new UserException("User already exists");
        };

        resolveGroup(user);
        return userRepository.save(user);
    }

}
