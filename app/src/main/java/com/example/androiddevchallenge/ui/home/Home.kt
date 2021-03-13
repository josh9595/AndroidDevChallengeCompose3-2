/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.home

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Spa
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.elevation

@Composable
fun Home() {
    Scaffold(
        bottomBar = {
            BottomNavigation(
                elevation = elevation,
                backgroundColor = MaterialTheme.colors.background
            ) {

                BottomNavigationItem(
                    icon = {
                        Icon(
                            Icons.Default.Spa,
                            contentDescription = null,
                            modifier = Modifier.size(18.dp),
                        )
                    },
                    label = {
                        Text(
                            "HOME",
                            style = MaterialTheme.typography.caption,
                            color = MaterialTheme.colors.onBackground,
                        )
                    },
                    selected = true,
                    onClick = {}
                )
                BottomNavigationItem(
                    icon = {
                        Icon(
                            Icons.Default.AccountCircle,
                            contentDescription = null,
                            modifier = Modifier.size(18.dp),
                        )
                    },
                    label = {
                        Text(
                            "PROFILE",
                            style = MaterialTheme.typography.caption,
                            color = MaterialTheme.colors.onSurface,
                        )
                    },
                    selected = true,
                    onClick = {}
                )
            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }, backgroundColor = MaterialTheme.colors.primary) {
                Icon(
                    Icons.Default.PlayArrow,
                    contentDescription = null,
                    modifier = Modifier.size(18.dp),
                )
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        isFloatingActionButtonDocked = true
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(top = 56.dp)
        ) {
            TextField(
                value = "",
                onValueChange = { /*TODO*/ },
                leadingIcon = {
                    Icon(
                        Icons.Filled.Search,
                        contentDescription = null,
                        modifier = Modifier.size(18.dp),
                    )
                },
                placeholder = {
                    Text(
                        "Search",
                        style = MaterialTheme.typography.body1,
                        color = MaterialTheme.colors.onSurface,
                    )
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp, 0.dp, 16.dp, 0.dp),
                colors = TextFieldDefaults.textFieldColors(backgroundColor = MaterialTheme.colors.surface)
            )
            Text(
                text = "FAVOURITE COLLECTIONS",
                style = MaterialTheme.typography.h2,
                color = MaterialTheme.colors.onBackground,
                modifier = Modifier
                    .paddingFromBaseline(40.dp)
                    .padding(16.dp, 0.dp, 0.dp, 0.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            LazyRow(
                content = {
                    item {
                        Column(Modifier.padding(16.dp, 0.dp, 8.dp, 0.dp)) {
                            Card("Short mantras", "ocean", R.drawable.short_mantras)
                            Spacer(Modifier.height(8.dp))
                            Card("Nature meditations", "Leaves", R.drawable.nature_meditations)
                        }
                    }
                    item {
                        Column(Modifier.padding(0.dp, 0.dp, 8.dp, 0.dp)) {
                            Card("Stress and anxiety", "beach", R.drawable.stress_and_anxiety)
                            Spacer(Modifier.height(8.dp))
                            Card("Self-massage", "stones", R.drawable.self_massage)
                        }
                    }
                    item {
                        Column(Modifier.padding(0.dp, 0.dp, 16.dp, 0.dp)) {
                            Card("Overwhelmed", "clouds", R.drawable.overwhelmed)
                            Spacer(Modifier.height(8.dp))
                            Card("Nightly wind down", "stars", R.drawable.nightly_wind_down)
                        }
                    }
                }
            )
            Text(
                text = "ALIGN YOUR BODY",
                style = MaterialTheme.typography.h2,
                color = MaterialTheme.colors.onBackground,
                modifier = Modifier
                    .paddingFromBaseline(40.dp)
                    .padding(16.dp, 0.dp, 0.dp, 0.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            LazyRow(
                content = {
                    item {
                        ImageList("Inversions", "Yoga pose", R.drawable.inversions, Modifier.padding(16.dp, 0.dp, 0.dp, 0.dp))
                    }
                    item {
                        ImageList("Quick yoga", "Yoga pose", R.drawable.quick_yoga)
                    }
                    item {
                        ImageList("Stretching", "Yoga pose", R.drawable.stretching)
                    }
                    item {
                        ImageList("Tabata", "Yoga pose", R.drawable.tabata)
                    }
                    item {
                        ImageList("HIIT", "Yoga pose", R.drawable.hiit)
                    }
                    item {
                        ImageList("Pre-natal yoga", "Yoga pose", R.drawable.pre_natal_yoga, Modifier.padding(0.dp, 0.dp, 8.dp, 0.dp))
                    }
                }
            )
            Text(
                text = "ALIGN YOUR MIND",
                style = MaterialTheme.typography.h2,
                color = MaterialTheme.colors.onBackground,
                modifier = Modifier
                    .paddingFromBaseline(40.dp)
                    .padding(16.dp, 0.dp, 0.dp, 0.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            LazyRow(
                content = {
                    item {
                        ImageList("Meditate", "Yoga pose", R.drawable.meditate, Modifier.padding(16.dp, 0.dp, 0.dp, 0.dp))
                    }
                    item {
                        ImageList("With kids", "Yoga pose with kid", R.drawable.with_kids)
                    }
                    item {
                        ImageList("Aromatherapy", "Yoga pose", R.drawable.aromatheraphy)
                    }
                    item {
                        ImageList("On the go", "Yoga pose", R.drawable.on_the_go)
                    }
                    item {
                        ImageList("With pets", "Yoga pose with doga", R.drawable.with_pets)
                    }
                    item {
                        ImageList("High stress", "Stressed man", R.drawable.high_stress, Modifier.padding(0.dp, 0.dp, 8.dp, 0.dp))
                    }
                }
            )
        }
    }
}

@Composable
fun Card(text: String, description: String, @DrawableRes image: Int) {
    Row(
        modifier = Modifier
            .width(192.dp)
            .height(56.dp)
            .clip(MaterialTheme.shapes.small)
            .background(MaterialTheme.colors.surface),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = image), contentDescription = description, contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(56.dp)
                .clip(MaterialTheme.shapes.small)
        )
        Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Center) {
            Text(text, style = MaterialTheme.typography.h3, color = MaterialTheme.colors.onSurface, modifier = Modifier.padding(16.dp, 0.dp))
        }
    }
}

@Composable
fun ImageList(text: String, description: String, @DrawableRes image: Int, modifier: Modifier = Modifier) {
    Column(
        modifier
            .padding(0.dp, 0.dp, 8.dp, 0.dp)
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = description,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(88.dp)
                .width(88.dp)
                .clip(CircleShape)
        )
        Box(modifier = Modifier.fillMaxWidth()) {
            Text(
                text,
                style = MaterialTheme.typography.h3,
                color = MaterialTheme.colors.onSurface,
                modifier = Modifier
                    .paddingFromBaseline(24.dp)
                    .width(88.dp),
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        Home()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        Home()
    }
}
