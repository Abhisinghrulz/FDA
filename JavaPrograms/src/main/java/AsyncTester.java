import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;

public class AsyncTester {

    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Abinash", "Divya", "exception", "Abhishek");

        Map<String,String> lMap = new ConcurrentHashMap();

        strList.stream().map(t -> {
            try {
                return checkResponse(t);
            } catch (InterruptedException | ExecutionException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return lMap;
        }).forEach( outputMap ->
                {
                    if(outputMap!=null)
                    {
                        for(Map.Entry<String,String> m1 : outputMap.entrySet())
                        {
                            lMap.put(m1.getKey(),m1.getValue());
                        }
                    }
                }
        );
        System.out.println(lMap);


    }

    public static Map<String,String> checkResponse(String inputString) throws  InterruptedException , ExecutionException
    {
        if(Objects.nonNull(checkResponse2(inputString)))
            return checkResponse2(inputString).get();
        else
            return null;
    }

    public static CompletableFuture<Map<String,String>> checkResponse2(String inputString)
    {
        try{
            if(inputString.equals("exception"))
            {
                throw new NullPointerException();
            }
            String opString =inputString +" Hello";
            Map<String,String> mp = new LinkedHashMap();
            mp.put(inputString,opString);
            return CompletableFuture.completedFuture(mp);
            //return null;
        }
        catch(NullPointerException ex)
        {
            System.out.println("handling null pointer");
        }
        return null;
    }

}