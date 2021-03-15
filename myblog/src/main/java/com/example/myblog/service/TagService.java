package com.example.myblog.service;

import com.example.myblog.pojo.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author : xsh
 * @create : 2020-02-12 - 0:06
 * @describe:
 */
public interface TagService {
    Tag saveTag(Tag tag);

    Tag getTag(Long id);

    Tag getTagByName(String name);

    Page<Tag> listTag(Pageable pageable);

    List<Tag> listTag();

    List<Tag> listTagTop(Integer size);


    Tag updateTag(Long id,Tag tag);

    void deleteTag(Long id);
}
