package `in`.xiandan.fresco.sample

import `in`.xiandan.fresco.sample.fragment.ShapeFragment
import `in`.xiandan.fresco.sample.fragment.WelcomeFragment
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private val INITIAL_NAVDRAWER_ITEM_ID = R.id.nav_welcome
    //private val INITIAL_NAVDRAWER_ITEM_ID = R.id.nav_shape

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(
            this,
            drawer_layout,
            toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
        nav_view.setCheckedItem(INITIAL_NAVDRAWER_ITEM_ID)
        handleNavigationItemClick(INITIAL_NAVDRAWER_ITEM_ID)

        nav_view.getHeaderView(0).setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(getString(R.string.welcome_label_github))
            startActivity(i)
        }
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        handleNavigationItemClick(item.itemId)
        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun handleNavigationItemClick(itemId: Int) {
        val fragment: ShowcaseFragment
        when (itemId) {
            R.id.nav_shape ->
                fragment = ShapeFragment()
            // More
            R.id.nav_welcome -> fragment = WelcomeFragment()
            else ->
                // Default to the welcome fragment
                fragment = WelcomeFragment()
        }
        showFragment(fragment)
    }

    /**
     * Utility method to display a specific Fragment. If the tag is not null we add a backstack
     *
     * @param fragment The Fragment to add
     */
    private fun showFragment(fragment: ShowcaseFragment) {
        val fragmentTransaction = getSupportFragmentManager()
            .beginTransaction()
            .replace(R.id.content_main, fragment as Fragment)
        if (fragment.backstackTag != null) {
            fragmentTransaction.addToBackStack(fragment.backstackTag)
        }
        fragmentTransaction.commit()

        setTitle(fragment.titleId)
    }

}
