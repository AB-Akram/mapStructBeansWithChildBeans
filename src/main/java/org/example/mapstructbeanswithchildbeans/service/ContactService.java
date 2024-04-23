package org.example.mapstructbeanswithchildbeans.service;

import org.example.mapstructbeanswithchildbeans.dto.ContactDTO;
import org.example.mapstructbeanswithchildbeans.entity.Contact;
import org.example.mapstructbeanswithchildbeans.mapper.ContactMapper;
import org.example.mapstructbeanswithchildbeans.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;
    @Autowired
    private ContactMapper contactMapper;

    public Contact saveContact(ContactDTO contactDTO) {
        return contactRepository.save(contactMapper.toEntity(contactDTO));
    }

    public ContactDTO getContactById(Long id) {
        return contactRepository.findById(id)
                .map(contactMapper::toDTO)
                .orElse(new ContactDTO());
    }

    public List<ContactDTO> getContactList() {
        List<Contact> contactList = contactRepository.findAll();
        return contactMapper.toDTO(contactList);
    }
}
