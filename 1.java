public class ReverseWord

{

public static void main(String[] args)

{

String inputString = "TEMPLE";

String outputString = reverseWord(inputString);

System.out.println("Original String: " + inputString);

System.out.println("Reversed String: " + outputString);

}

private static String reverseWord(String inputStr)

{

char[] charArray = inputStr.toCharArray();

int start = 0;

int end = charArray.length - 1;

while (start < end)

{

char temp = charArray[start];

charArray[start] = charArray[end];

charArray[end] = temp;

start++;

end--;

}

return new String(charArray);

}

}