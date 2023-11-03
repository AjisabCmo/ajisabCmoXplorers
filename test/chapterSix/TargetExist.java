package chapterSix;

public class TargetExist {


        public static boolean findingTargetExist( int number, int index, int index2, int target){
            String numberStr = String.valueOf((number));
            int length = numberStr.length();
            String findingTargetExist = String.valueOf(numberStr.charAt(index));
            int value1 = Integer.parseInt((findingTargetExist));
            String findingTargetExist2 = String.valueOf(numberStr.charAt(index2));
            int value2 = Integer.parseInt((findingTargetExist2));



//            if (index < 0 || index >= numberStr.length() || index2 < 0 || index2 >= numberStr.length()) {
//                return false;
//
//            }
//            int start = Math.min(index, index2);
//            int follow = Math.max(index, index2);
//
//            String subStr = numberStr.substring(start, follow + 1 );
//
//            int num = Integer.parseInt(subStr);
//            return num == target;
            return value1 < target && value2 > target;
        }
    }
