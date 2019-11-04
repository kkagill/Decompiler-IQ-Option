package com.iqoption.dto.entity.video;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;

public class VideoEducation {
    public Double duration;
    public String name;
    public Integer namePosition;
    public Integer position;
    public String preview;
    public Integer progress = null;
    public Long size;
    public String url;
    public Boolean viewed = Boolean.valueOf(false);

    public static class List extends ArrayList<VideoEducation> {
        @Nullable
        public VideoEducation getItem(int i) {
            Iterator it = iterator();
            while (it.hasNext()) {
                VideoEducation videoEducation = (VideoEducation) it.next();
                if (videoEducation.hashCode() == i) {
                    return videoEducation;
                }
            }
            return null;
        }

        public void merge(List list) {
            if (list != null) {
                Iterator it = iterator();
                while (it.hasNext()) {
                    VideoEducation videoEducation = (VideoEducation) it.next();
                    videoEducation.merge(list.getItem(videoEducation.hashCode()));
                }
            }
        }
    }

    private void merge(VideoEducation videoEducation) {
        this.progress = videoEducation.progress;
        this.viewed = videoEducation.viewed;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VideoEducation videoEducation = (VideoEducation) obj;
        String str = this.url;
        if (!str == null ? str.equals(videoEducation.url) : videoEducation.url == null) {
            return false;
        }
        str = this.preview;
        if (!str == null ? str.equals(videoEducation.preview) : videoEducation.preview == null) {
            return false;
        }
        Long l = this.size;
        if (!l == null ? l.equals(videoEducation.size) : videoEducation.size == null) {
            return false;
        }
        Double d = this.duration;
        if (d != null) {
            z = d.equals(videoEducation.duration);
        } else if (videoEducation.duration != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.url;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.preview;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l = this.size;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Double d = this.duration;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode + i;
    }
}
