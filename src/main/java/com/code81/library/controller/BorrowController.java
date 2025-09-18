package com.code81.library.controller;

import com.code81.library.entity.BorrowTransaction;
import com.code81.library.repository.BorrowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/borrows")
public class BorrowController {
    @Autowired private BorrowRepository repo;

    @GetMapping
    public List<BorrowTransaction> getAll() { return repo.findAll(); }

    @PostMapping
    public BorrowTransaction create(@RequestBody BorrowTransaction tx) { return repo.save(tx); }
}
