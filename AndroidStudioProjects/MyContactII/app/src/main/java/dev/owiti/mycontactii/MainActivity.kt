package dev.owiti.mycontactii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.owiti.mycontactii.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweets()
    }

    fun displayTweets(){

        var tweet1=Twitter("Esther","@Owittiesther","The public is more familiar with bad design " +
                "than good design. It is, in effect, conditioned to prefer bad design, because that is " +
                "what it lives with. The new becomes threatening, the old reassuring","20","59","678","49","13","")
        var tweet2=Twitter("Eric Washn ","@eric33","Design is not just what it looks like and feels like. " +
                "Design is how it works","456","677","4568","100","676","")
        var tweet3=Twitter("Andrea Brillante","@angreaBr","It is a waste of energy when we try to conform to a " +
                "pattern. To conserve energy we must be aware of how we dissipate energy.","565","676","45","566","87","")
        var tweet4=Twitter("Jake Roman","@JR","Disappointment and adversity can be catalysts for greatness." +
                " There’s something particularly exciting about being the hunter, as opposed to the hunted. And that can" +
                " make for powerful energy.","767","785","534","767","56","")
        var tweet5=Twitter("Keith J","@KeithJ","Disappointment and adversity can be catalysts for greatness." +
                " There’s something particularly exciting about being the hunter, as opposed to the hunted. And that can" +
                " make for powerful energy.","767","785","534","767","56","")
        var tweet6=Twitter("Jay Young","@JayYang","Disappointment and adversity can be catalysts for greatness." +
                " There’s something particularly exciting about being the hunter, as opposed to the hunted. And that can" +
                " make for powerful energy.","767","785","534","767","56","")
        var tweetList =
            listOf(tweet1,tweet2,tweet3,tweet4,tweet5,tweet6)
        var tweetAdapter=TwitterRvAdapter(tweetList)
        binding.rvTweet.layoutManager= LinearLayoutManager(this)
        binding.rvTweet.adapter=tweetAdapter

    }  }