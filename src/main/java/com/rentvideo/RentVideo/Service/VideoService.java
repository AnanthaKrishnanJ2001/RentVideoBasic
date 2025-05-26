package com.rentvideo.RentVideo.Service;

import java.util.List;

import com.rentvideo.RentVideo.Model.Video;

public interface VideoService {
    List<Video> getAvailableVideos();
    Video createVideo(Video video);
    Video updateVideo(String title,Video video);
    void deleteVideo(String title);
}
