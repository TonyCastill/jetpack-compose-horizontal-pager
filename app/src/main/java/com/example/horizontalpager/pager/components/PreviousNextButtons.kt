package com.example.horizontalpager.pager.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.PagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role.Companion.Button
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PreviousNextButtons(pagerState: PagerState,pages: Int){
    val scope : CoroutineScope = rememberCoroutineScope()
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(onClick ={
            scope.launch { pagerState.animateScrollToPage(pagerState.currentPage-1) }
        }){
            Icon(imageVector = Icons.Rounded.ArrowBack, contentDescription = null )

        }
        PageIndicator(pagerState = pagerState, pageCount = pages)
        Button(onClick ={
            if(pagerState.currentPage==pages-1){
                scope.launch { pagerState.animateScrollToPage(0)}
            }else
            {
                scope.launch { pagerState.animateScrollToPage(pagerState.currentPage+1) }
            }
        }){
            Icon(imageVector = Icons.Rounded.ArrowForward, contentDescription = null )

        }
    }
}