import java.util.ArrayList;

public class Delimiters
{
    /** The open and close delimiters **/
    private String openDel;
    private String closeDel;

    /** Constructs a Delimiters object where open is the open delimiter and close is the
     *  close delimiter.
     *  Precondition: open and close are non-empty strings.
     */
    public Delimiters(String open, String close)
    {
        openDel = open;
        closeDel = close;
    }

    /** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
    public ArrayList<String> getDelimitersList(String[] tokens)
    {
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals(openDel) || tokens[i].equals(closeDel)) {
                stringArrayList.add(tokens[i]);
            }
        }
        return stringArrayList;
    }

    /** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
     *  Precondition: delimiters contains only valid open and close delimiters.
     */
    public boolean isBalanced(ArrayList<String> delimiters)
    {
        int open1 = 0, close1 = 0;
        for (String delimiter : delimiters) {
            if(delimiter.equals(openDel)) {
                open1++;
            } else if (delimiter.equals(closeDel)) {
                close1++;
            }
            if (close1 > open1) {
                return false;
            }
        }
        return open1 == close1;
    }
}