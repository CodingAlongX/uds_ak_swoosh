package pro.smjx.swoosh.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_finish.*
import pro.smjx.swoosh.Model.Player
import pro.smjx.swoosh.R
import pro.smjx.swoosh.Utilities.EXTRA_PLAYER

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesText.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}
