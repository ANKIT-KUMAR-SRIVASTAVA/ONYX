package com.as.ankitshubham.onyx;

import java.util.ArrayList;
import java.util.List;


public class Utils {
    public static final List<Friend> friends = new ArrayList<>();

    static {
        friends.add(new Friend(R.drawable.ankit, "ANKIT KUMAR SRIVASTAVA", R.color.sienna, "GCET","IT"," 3rd Year", "APP Developer","9899098262"));
        friends.add(new Friend(R.drawable.shubham, " KUMAR SHUBHAM", R.color.saffron,"GCET","IT"," 3rd Year", "APP Developer","8588820627"));
    }
    /*public static final List<Friend> friends1 = new ArrayList<>();

    static {
        friends1.add(new Friend(R.drawable.ankit, "ANKIT KUMAR SRIVASTAVA", R.color.sienna, "Galgotias","College","IT"," 3rd Year", "APP Developer"));
        friends1.add(new Friend(R.drawable.shubham, " KUMAR SHUBHAM", R.color.saffron,"Galgotias","College","IT"," 3rd Year", "APP Developer"));
    }
    public static final List<Friend> team = new ArrayList<>();

    static {
        team.add(new Friend(R.drawable.ankit, "ANKIT KUMAR SRIVASTAVA", R.color.sienna, "Galgotias","College","IT"," 3rd Year", "APP Developer"));
        team.add(new Friend(R.drawable.shubham, " KUMAR SHUBHAM", R.color.saffron,"Galgotias","College","IT"," 3rd Year", "APP Developer"));
        /*friends.add(new Friend(R.drawable.kate, "KATE", R.color.green, "Sales", "Pets", "Skiing", "Hairstyles", "Сoffee"));
        friends.add(new Friend(R.drawable.paul, "PAUL", R.color.pink, "Android", "Development", "Design", "Wearables", "Pets"));
        friends.add(new Friend(R.drawable.daria, "DARIA", R.color.orange, "Design", "Fitness", "Healthcare", "UI/UX", "Chatting"));
        friends.add(new Friend(R.drawable.kirill, "KIRILL", R.color.saffron, "Development", "Android", "Healthcare", "Sport", "Rock Music"));
        friends.add(new Friend(R.drawable.julia, "JULIA", R.color.green, "Cinema", "Music", "Tatoo", "Animals", "Management"));
        friends.add(new Friend(R.drawable.yalantis, "YALANTIS", R.color.purple, "Android", "IOS", "Application", "Development", "Company"));
    }*/
}
