package com.code81.library.controller;

import com.code81.library.entity.Member;
import com.code81.library.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {
    @Autowired private MemberRepository repo;

    @GetMapping
    public List<Member> getAll() { return repo.findAll(); }

    @PostMapping
    public Member create(@RequestBody Member member) { return repo.save(member); }
}
