package com.example.livescoremvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.livescoremvvm.ui.theme.LiveScoreMVVMTheme
import com.example.livescoremvvm.viewmodel.InplayMatchesViewModel
import com.example.livescoremvvm.viewmodel.state.MatchesState
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LiveScoreMVVMTheme {
               Column(modifier = Modifier.padding(10.dp)) {
                   TopAppBar()
                   FetchData()
               }
            }
        }
    }
}

@Composable
fun TopAppBar() {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Default.Refresh, contentDescription = "Refresh Icon")
        }
        Text(text = "LiveScores", style = MaterialTheme.typography.h4)
        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = ImageVector.vectorResource(id = R.drawable.modeicon), contentDescription = "Toggle Theme")
        }
    }
}

@Composable
fun FetchData(inplayMatchesViewModel: InplayMatchesViewModel = viewModel()) {
    Column {
        when(val state = inplayMatchesViewModel.inplayMatchesState.collectAsState().value) {
            is MatchesState.Empty -> Text(text = "No data available")
            is MatchesState.Loading -> Text(text = "Loading...")
            is MatchesState.Success -> Text(text = "Success")
            is MatchesState.Error -> Text(text = state.message)
        }
    }
}