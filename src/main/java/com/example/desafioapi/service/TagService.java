package com.example.desafioapi.service;

import com.example.desafioapi.entity.Tag;
import com.example.desafioapi.repository.TagRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TagService {

    private final TagRepository tagRepository;

    public TagService(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    public void saveTag(Tag tag) {
        tagRepository.save(tag);
    }

    public void deleteTag(Long id) {
        tagRepository.deleteById(id);
    }

    public Tag buscarIdTag(Long id) throws Exception {
        Optional<Tag> tag = tagRepository.findById(id);
        if (tag.isEmpty()) {
            throw new Exception("Tag nao encotrando");
        }
        return tag.get();

    }

    public List<Tag> buscarTodos() {
        return tagRepository.findAll();
    }
}
