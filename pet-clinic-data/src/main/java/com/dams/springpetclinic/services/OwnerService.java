package com.dams.springpetclinic.services;

import com.dams.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
