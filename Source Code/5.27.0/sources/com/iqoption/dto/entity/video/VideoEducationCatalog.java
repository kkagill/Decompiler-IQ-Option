package com.iqoption.dto.entity.video;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;

public class VideoEducationCatalog {
    public String directory;
    public String locale;
    public com.iqoption.dto.entity.video.SorterObj.List orders;
    public com.iqoption.dto.entity.video.VideoEducation.List videos;

    public static class List extends ArrayList<VideoEducationCatalog> {
        public void merge(List list) {
            if (list != null) {
                Iterator it = iterator();
                while (it.hasNext()) {
                    VideoEducationCatalog videoEducationCatalog = (VideoEducationCatalog) it.next();
                    videoEducationCatalog.merge(list.getItem(videoEducationCatalog.hashCode()));
                }
            }
        }

        @Nullable
        public VideoEducationCatalog getItem(int i) {
            Iterator it = iterator();
            while (it.hasNext()) {
                VideoEducationCatalog videoEducationCatalog = (VideoEducationCatalog) it.next();
                if (videoEducationCatalog.hashCode() == i) {
                    return videoEducationCatalog;
                }
            }
            return null;
        }

        @Nullable
        public com.iqoption.dto.entity.video.VideoEducation.List getCurrentVideoList(String str) {
            Iterator it = iterator();
            while (it.hasNext()) {
                VideoEducationCatalog videoEducationCatalog = (VideoEducationCatalog) it.next();
                if (videoEducationCatalog.locale.equals(str)) {
                    return videoEducationCatalog.videos;
                }
            }
            return null;
        }

        @Nullable
        public VideoEducationCatalog getCurrentCatalog(String str) {
            Iterator it = iterator();
            while (it.hasNext()) {
                VideoEducationCatalog videoEducationCatalog = (VideoEducationCatalog) it.next();
                if (videoEducationCatalog.locale.equals(str)) {
                    return videoEducationCatalog;
                }
            }
            return null;
        }
    }

    public void merge(VideoEducationCatalog videoEducationCatalog) {
        if (videoEducationCatalog != null) {
            this.videos.merge(videoEducationCatalog.videos);
        }
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VideoEducationCatalog videoEducationCatalog = (VideoEducationCatalog) obj;
        String str = this.locale;
        if (!str == null ? str.equals(videoEducationCatalog.locale) : videoEducationCatalog.locale == null) {
            return false;
        }
        str = this.directory;
        if (str != null) {
            z = str.equals(videoEducationCatalog.directory);
        } else if (videoEducationCatalog.directory != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.locale;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.directory;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
