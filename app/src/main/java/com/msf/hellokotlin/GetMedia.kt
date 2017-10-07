package com.msf.hellokotlin

/**
 * Created by karthick on 10/7/2017.
 */

private val thumbBaseURL = "http://lorempixel.com/400/400/cats/"

fun getMedia() = listOf(MediaItem("Title 1", "${thumbBaseURL}1", MediaItem.Type.PHOTO),
        MediaItem("Title 2", "${thumbBaseURL}2", MediaItem.Type.PHOTO),
        MediaItem("Title 3", "${thumbBaseURL}3", MediaItem.Type.PHOTO),
        MediaItem("Title 4", "${thumbBaseURL}4", MediaItem.Type.VIDEO),
        MediaItem("Title 5", "${thumbBaseURL}5", MediaItem.Type.PHOTO),
        MediaItem("Title 6", "${thumbBaseURL}6", MediaItem.Type.PHOTO),
        MediaItem("Title 7", "${thumbBaseURL}7", MediaItem.Type.PHOTO),
        MediaItem("Title 8", "${thumbBaseURL}8", MediaItem.Type.PHOTO),
        MediaItem("Title 9", "${thumbBaseURL}9", MediaItem.Type.PHOTO),
        MediaItem("Title 10", "${thumbBaseURL}10", MediaItem.Type.VIDEO)
)