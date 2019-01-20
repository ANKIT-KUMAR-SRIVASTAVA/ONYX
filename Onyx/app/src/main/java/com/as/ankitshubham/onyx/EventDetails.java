package com.as.ankitshubham.onyx;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

//import com.mxn.soul.flowingdrawer_core.FlowingView;
//import com.mxn.soul.flowingdrawer_core.LeftDrawerLayout;

public class EventDetails extends AppCompatActivity {
    String[] intro={"Debate has been the soul of literature for a long time, not just literature, be it everything from presidential elections to the discussions at tea stalls,debates makes it all. \n" +
            "\n" +
            "Debate is an application of freedom of speech,a tool which every citizen is entitled to exercise.\n" +
            "\n" +
            "Abhivyakti is an open debate,a platform where everybody is free to express their views,ask questions and counter.\n" +
            "\n" +
            "Step up, the podium awaits you.","Poetary is the song of life captured in ink and parchment. \n" +
            "It’s a reflection of life, as seen from a house of mirrors, an extra curve here, and an exaggerated edge there. \n" +
            "\n" +
            "Poems lie their way to the truth, conveying the ineffable through the contradictory. A Poet obscures and blurs to make things clearer, making us feel the words even before we comprehend them.","Ever experienced hurdles in presenting your thoughts and Ideas? Wish to speak your heart out on the trending issues?At ONYX 2017, we present to you the most popular discussion platform of Galgotias Litereary Club, MindSpark- Let’s create a better society.\n" +
            "\n" +
            "MindSpark is an open platform for speaking up your views and opinions on the issues that affect society.MindSpark is acclaimed to be effective in bringing up solutions to social problems as it involves open ended viewpoints which run far beyond ordinary vision. Be at MindSpark and experience the thrill of being a part of heated discussion which affects the society and enrich yourself with the knowledge and experience of our class apart panelists.\n" +
            "\n" +
            "This is not an ordinary discussion, it's a discussion to speak your hearts out. Let’s create a better society.","Monologues have always been a part of literature. Oral traditions have been passed down since the age of Homer, and remains popular to this date. \n" +
            "Show us the mettle of your pasture, by delivering your favorite monologue, anywhere from Shakespeare to The Matrix.","Wizardry and wonder fills the air this February when ONYX 2k17 brings to you the Potter Mania, a blockbuster for the best of potter heads, two days of spell binding events that magically morph the neighborhood into the much loved fictional world created by JK Rowling.\n" +
            "\n" +
            "So if you have ever chanted Wingardium Leviosa in excitement or have thought of mixing potions or you find the series magical - Welcome to an enchanting event day of Wizardry and Witchcraft - all about the sorting hat, a scavenger hunt and much more.","Do you see yourself as a pro of the fantasy world, a master who can't be messed with, a beast who devours fantasy literature at breakfast, well think again because our contest will put your knowledge to the ultimate challenge where you will be provided with 10 completely random excerpts from all across the wonderland and you will have to guess the correct name of the novel or TV show.","We bring back to you the most awaited event yes, it's time for naughty notes to get naughtier. So pull up your socks because this isn't gonna be a simple game but an extravaganza of emotional melodrama, a web of  complex secrets and the most funny incidents all glued up in just one story.","Do you feel like tampering with continuum probabilities? Have you ever thought what the world would be like, if you could travel in time? \n" +
            "\n" +
            "What would you do, if you found yourself, in a causality loop?\n" +
            "\n" +
            "While time paradoxes are errors in logic and don’t exist in the real world (probably), they are a great tool in science fiction.  Come misfire neurons and write a story where your protagonist struggles against the flow of time itself."};
    String[] rule={"1-Standard conduct of Rebuttal style debating will be followed.\n" +
            "\n" +
            "2-There will be two rounds of debating- Round 1- Normal debating and Round 2-An Impromptu debate round for qualifiers of Round 1.\n" +
            "\n" +
            "3-Entry of a team of two speakers will be allowed,where Rebuttal style debate will be conducted. \n" +
            "\n" +
            "Round 1-Rebuttal Debate on the given topic with speakers order being- First argument from affirmative side followed by two consecutive arguments from negative side and then a closing argument from affirmative side. Each speaker will get maximum 3 min to express their stand on the topic.\n" +
            "\n" +
            "Round 2-Impromptu(On the spot new topic) debate round will be conducted among the top 6 teams from Round 1 with each speaker getting maximum 2 min to express their \n" +
            "stand in the aforementioned debate order and 1 interjection will also be allowed from judge’s side.\n" +
            "\n" +
            "Only English and Only Hindi is allowed as language of debate in Abhivyakti.","1-There will be two rounds\n" +
            "\n" +
            "2-The first round would require the participants to write a haiku in English/ Hindi based on the chit drawn from the lot.\n" +
            "\n" +
            "3-The second round will require the participants to write a poem on the picture provided.In this round participants may choose to write the poem in the format they wish exempli gratia free verse, blank verse, sonnets, and sestinas. Etc.\n" +
            "\n" +
            "4-The participants will be judged on:\n" +
            "\n" +
            "\ta-Use of language\n" +
            "\n" +
            "\tb-Use of poetic devices like assonance, consonance, alliteration, onomatopoeia, etc.\n" +
            "\n" +
            "\tc-Use of rhyme scheme\n" +
            "\n" +
            "Rules for writing the Haiku:\n" +
            "\n" +
            "1-Departing from the traditional 5:7:5 syllable format, participants are allowed to use 17 words, regardless of the syllables.\n" +
            "\n" +
            "2-Of these 17 words, one word is going to be the poet’s name. So that gives the poet an effective 16 words to write in.","1-Standard conduct of Group Discussion applies to MindSpark.\n" +
            "\n" +
            "2-There will be two rounds of discussion- Round 1- Non Interjection Round and Round 2-Interjection Round.\n" +
            "\n" +
            "3-In Round 1, discussion will be started by panelists and after that points will be invited from participants.Speakers will be recognized by panelists as they raise their chest numbers.Each speaker will get 1 min. to express his/her views to panelists in Round 1.\n" +
            "\n" +
            "4-In Round 2 ,panelists will ask agenda derived scenario based questions from participants and then interjections among participants will be allowed. Maximum 2 interjections to a viewpoint will be entertained.\n" +
            "\n" +
            "5-Both English and Hindi are allowed as the language of discussion.","*Prepare your own script\n" +
            "\n" +
            "*Or get script from us\n" +
            "  \n" +
            "*Use of single language is allowed.\n" +
            "\n" +
            "*No duplication of script from other participants.\n" +
            "\n" +
            "*Bonus will be on voice modulation.\n" +
            "\n" +
            "*Minus marking will be on\n" +
            "\n" +
            "1.Use of two languages.\n" +
            "\n" +
            "2.Use of any word that points any religion or society.\n" +
            "\n" +
            "3.On personal comments\n" +
            "\n" +
            "4.Breaking the rules or misbehaving.","The event is divided into two rounds:\n" +
            "Round 1:*Know your wizard*:\n" +
            "\tAn enticing quiz competition containing three sub rounds. Elimination process will take place after each round and in the end , the top four teams will be qualifying for the second round of the event. Further rules of the quiz regarding scores and elimination will be explained on the day of the event only.\n" +
            "\n" +
            "Round 2:*Hunt the horcruxes*\n" +
            "The top four qualified teams after the quiz will then go for a hunt battling thorough the jinxes and curses solving clues and casting spells for an audacious hunt for the horcruxes.\n" +
            "\n" +
            "Each team will be given some clues based on that they'll have to hunt for the seven horcruxes hidden in the campus.\n" +
            "\n" +
            "Each horcrux will be carrying 50 points and a bonus snitch caring 100 points will be a part of the hunt as well. The team with the maximum points wins the event. \n" +
            "\n" +
            "Rules regarding the snitch and the clues will be explained on the spot only.","The quiz will be conducted in written format and will have two rounds:\n" +
            "1)20 Excerpts from movies/books will be given and the participants will have to write down their answers in the sheets provided.\n" +
            "\n" +
            "The time allotted for this round will be 15 minutes.\n" +
            "\n" +
            "2)Out of all the participants, only 10 will proceed to the next round which will also be a written one.Here, 15 one liners will be given and the participant will have to guess the movie/book based on that line within 10 minutes.\n" +
            "\n" +
            "No negative marking will be done in either of the rounds.\n" +
            "\n" +
            "The competitors standing 1st,2nd and 3rd will be awarded certificates.\n" +
            "\n" +
            "Use of mobile phones is strictly prohibited,if caught,would be immediately disqualified.","We give you all your liberty to choose any number of characters but less than six. The story must *not be boring*. The use of funny lines and hotshot dialogues is mandatory and the plot must be crazy enough to send the judges into a world of their own and think that WOW what a plot. \n" +
            "\n" +
            "Rules \n" +
            "1)You will be given 30 min to design your own story. \n" +
            "\n" +
            "2)After 30 min your stories will be shuffled and you will have a new plot. \n" +
            "\n" +
            "3)Finish the newly allotted script in the best possible way keeping the plot in mind within 30 min.","1)Participants have to write a story based on scenarios revolving around a time paradox.\n" +
            "\n" +
            "2)The participant will have to pick chits from two separate bowls.\n" +
            "\n" +
            "3)The first bowl will detail the outline/plot of the story.\n" +
            "\n" +
            "4)The second one will list the paradox.\n" +
            "\n" +
            "5)Participants will have to write a story combining both the chits into a coherent storyline."};
String[] fee={"single-50\n(Team of 2)-100","50","40 ","40","single-50\nteam-100","50","30","30",};
    String[] co={"Devanshi - +918874483070\n","Akshat - +919810555053","Danish - 8909337749 \nSarthak - 08588931236","Abhishek Srivastava - +917073875253","Naved - 9717223691","Anant - +919650078975\nShivangi-+919582740365","Ayush-+919761188177","Raaj - +918252378008\nAkshat - +919810555053"};
   String[]contact={"tel:+918874483070","tel:+919810555053","tel: 8909337749","tel:917073875253","tel:9717223691","tel: 919650078975","tel:+919761188177","tel:+918252378008"};

    TextView introTV,ruleTV,feeTV,coTV;
    ImageButton phn;
    String phone;

    //private LeftDrawerLayout mLeftDrawerLayout;
    //MyMenuFragment mMenuFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_details);
        introTV=(TextView)findViewById(R.id.intro);
        ruleTV=(TextView)findViewById(R.id.des);
        feeTV=(TextView)findViewById(R.id.rules);
        coTV=(TextView)findViewById(R.id.coord);
        phn=(ImageButton)findViewById(R.id.imageButton4);
        int po;

        String p= getIntent().getExtras().getString("pos");
        switch (p)
        {
            case "ABHIVYAKTI": po=0;
                introTV.setText(intro[po]);
                ruleTV.setText(rule[po]);
                feeTV.setText(fee[po]);
                coTV.setText(co[po]);
                phone=contact[po];
                            break;
            case "KAVI SAMMELAN": po=1;
                introTV.setText(intro[po]);
                ruleTV.setText(rule[po]);
                feeTV.setText(fee[po]);
                coTV.setText(co[po]);
                phone=contact[po];
                break;
            case "MINDSPARK": po=2;
                introTV.setText(intro[po]);
                ruleTV.setText(rule[po]);
                feeTV.setText(fee[po]);
                coTV.setText(co[po]);
                phone=contact[po];
                break;
            case "MONOLOGUE": po=3;
                introTV.setText(intro[po]);
                ruleTV.setText(rule[po]);
                feeTV.setText(fee[po]);
                coTV.setText(co[po]);
                phone=contact[po];
                break;
            case "POTTER MANIA": po=4;
                introTV.setText(intro[po]);
                ruleTV.setText(rule[po]);
                feeTV.setText(fee[po]);
                coTV.setText(co[po]);
                phone=contact[po];
                break;
            case "QUIZ": po=5;
                introTV.setText(intro[po]);
                ruleTV.setText(rule[po]);
                feeTV.setText(fee[po]);
                coTV.setText(co[po]);
                phone=contact[po];
                break;
            case "NAUGHTY NOTES": po=6;
                introTV.setText(intro[po]);
                ruleTV.setText(rule[po]);
                feeTV.setText(fee[po]);
                coTV.setText(co[po]);
                phone=contact[po];
                break;
            case "TIME PARADOX": po=7;
                introTV.setText(intro[po]);
                ruleTV.setText(rule[po]);
                feeTV.setText(fee[po]);
                coTV.setText(co[po]);
                phone=contact[po];
                break;
        }


    /*setupToolbar();

    mLeftDrawerLayout = (LeftDrawerLayout) findViewById(R.id.id_drawerlayout);

    FragmentManager fm = getSupportFragmentManager();
    mMenuFragment = (MyMenuFragment) fm.findFragmentById(R.id.id_container_menu);
    FlowingView mFlowingView = (FlowingView) findViewById(R.id.sv);
    if (mMenuFragment == null) {
        fm.beginTransaction().add(R.id.id_container_menu, mMenuFragment = new MyMenuFragment()).commit();
    }
    mLeftDrawerLayout.setFluidView(mFlowingView);
    mLeftDrawerLayout.setMenuFragment(mMenuFragment);*/
        phn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse(phone));
                startActivity(intent);
            }
        });


}
    /*public void setupToolbar() {
       Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_menu_white);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLeftDrawerLayout.toggle();
            }
        });

    }
    @Override
    public void onBackPressed() {
        if (mLeftDrawerLayout.isShownMenu()) {
            mLeftDrawerLayout.closeDrawer();
        } else {
            super.onBackPressed();
        }
    }*/

}
