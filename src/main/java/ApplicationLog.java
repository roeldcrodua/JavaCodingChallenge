import java.util.*;

public class ApplicationLog {
    /*
    Problem Statement:
    Given an application log, write a program to find customers who faced login denied issue consecutively for 3-days.

    Log statement format:
    <yyyy-mm-dd|hh:mm:ss> <Log Level> <Customer email> <Error Code> "<Error Message>"

    The log for the access denied issue has a Log Level of ERROR and the Error Message contains the tag: 'SERVICE LOGIN'.

    Sample error log:
    2018-04-03|22:34:32 ERROR thompson_ret@infosystems.uk 020 "SERVICE LOGIN-customer login failed due to InfoServicePortalDB failure"

    Sample success log:
    2018-04-03|23:20:03 INFO thompson_ret@infosystems.uk 001 "SERVICE LOGIN-logged in successfully to dashboard"

    Input format:

    First line contains the number of log entries N and the next N lines contain the log statements. Read the input from the standard input stream.

    Output format:

    Print the emailIDs without @domainname (i.e, username) in alphabetical order separated by comma to the standard output stream

    Sample Input	Sample Output	Explanation
    20
    2018-04-01|06:34:32 ERROR mary_karen@infosystems.uk 020 "SERVICE LOGIN-customer login failed due to InfoServicePortalDB failure"
    2018-04-01|07:34:08 INFO sunny_laden@infosystems.uk 001 "SERVICE LOGIN-logged in successfully to dashboard"
    2018-04-01|09:14:18 INFO karen_jenner@infosystems.uk 001 "SERVICE LOGIN-logged in successfully to dashboard"
    2018-04-01|11:35:30 ERROR mary_karen@infosystems.uk 016 "MARKETPLACE LAUNCH-launch data fetch failed due to InfoServicePortalDB failure"
    2018-04-02|07:20:02 INFO sunny_laden@infosystems.uk 001 "SERVICE LOGIN-logged in successfully to dashboard"
    2018-04-02|08:32:13 INFO mary_karen@infosystems.uk 001 "SERVICE LOGIN-logged in successfully to dashboard"
    2018-04-02|16:34:20 ERROR sunny_laden@infosystems.uk 020 "SERVICE LOGIN-customer login failed due to InfoServicePortalDB failure"
    2018-04-03|06:10:32 ERROR mary_karen@infosystems.uk 020 "SERVICE LOGIN-customer login failed due to InfoServicePortalDB failure"
    2018-04-03|09:14:18 INFO karen_jenner@infosystems.uk 001 "SERVICE LOGIN-logged in successfully to dashboard"
    2018-04-03|14:13:32 ERROR mary_karen@infosystems.uk 020 "SERVICE LOGIN-customer login failed due to InfoServicePortalDB failure"
    2018-04-04|04:35:45 ERROR mary_karen@infosystems.uk 016 "MARKETPLACE LAUNCH-launch data fetch failed due to InfoServicePortalDB failure"
    2018-04-04|06:10:32 ERROR mary_karen@infosystems.uk 020 "SERVICE LOGIN-customer login failed due to InfoServicePortalDB failure"
    2018-04-04|08:32:13 INFO shekhar_j@infosystems.in 001 "SERVICE LOGIN-logged in successfully to dashboard"
    2018-04-04|09:21:11 INFO jon_trever@infosystems.us 001 "SERVICE LOGIN-logged in successfully to dashboard"
    2018-04-04|11:21:11 INFO randy_marykon@infosystems.us 001 "SERVICE LOGIN-logged in successfully to dashboard"
    2018-04-04|16:14:20 ERROR sunny_laden@infosystems.uk 020 "SERVICE LOGIN-customer login failed due to InfoServicePortalDB failure"
    2018-04-05|06:10:12 ERROR mary_karen@infosystems.uk 020 "SERVICE LOGIN-customer login failed due to InfoServicePortalDB failure"
    2018-04-05|09:21:11 INFO jon_trever@infosystems.us 001 "SERVICE LOGIN-logged in successfully to dashboard"
    2018-04-06|16:21:10 INFO ross_kent@infosystems.us 001 "SERVICE LOGIN-logged in successfully to dashboard"
    2018-04-07|13:04:20 ERROR sunny_laden@infosystems.uk 020 "SERVICE LOGIN-customer login failed due to InfoServicePortalDB failure"
    mary_karen
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int logCount = 0;
        List<String> logs = new ArrayList<>();

        int i = 0;
        while(sc.hasNextLine()){
            String read = sc.nextLine();
//            if (i==0) {
//                logCount = Integer.parseInt(read);
//            }else {
//                logs.add(read);
//                System.out.println(read);
//            }
            logs.add(read);

            i++;
            if (sc.nextLine() == null  || sc.nextLine().isEmpty()){
                break;
            }
        }
        getUserConsecutivelyLoginDenied(logs, logCount);
    }

    public static void getUserConsecutivelyLoginDenied(List<String> logs, int logCount){
        List<String> filterLogs = new ArrayList<>();
        for (String log: logs){
            if (log.contains("ERROR") && log.contains("SERVICE LOGIN-customer")){
                filterLogs.add(log);
            }
        }
        TreeMap<String, String> logMap = new TreeMap<>();
        for ( String l: filterLogs) {
            String[] details = l.substring(0,l.indexOf("@")).split(" ");
            Integer date = Integer.parseInt(details[0].substring(0,details[0].indexOf("|")).replace("-",""));
            String email = details[2];
            String key = email + date;
            logMap.put(key, email);
        }
        int counter =0 ;
        int baseTime = 0;
        Set<String> result = new HashSet<>();
        for (Map.Entry l:logMap.entrySet()){

            int date = Integer.parseInt(l.getKey().toString().substring(l.getKey().toString().length()-8));
            if (date+1 == baseTime) {
                counter++;
            } else {
                baseTime = date;
                counter =0;
            }
            if (counter>=3){
                result.add(l.getValue().toString());
                counter =0;
            }
        }
        for (String out: result){
            System.out.println(out);
        }
    }
}
