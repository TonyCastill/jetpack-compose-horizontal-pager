package com.example.horizontalpager.pager

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.horizontalpager.pager.components.PreviousNextButtons
import com.example.horizontalpager.pager.components.SinglePage
import com.example.horizontalpager.pager.components.pages

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PagerScreen(){
    val pagerState : PagerState = rememberPagerState(pageCount = {3})
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){ 
        HorizontalPager(state=pagerState) { pageIndex->
            SinglePage(page = pages[pageIndex])
        }

        Spacer(modifier=Modifier.size(16.dp))

        PreviousNextButtons(pagerState = pagerState,pages.size)

    }
}
