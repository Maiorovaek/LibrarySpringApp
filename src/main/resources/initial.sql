create table address
(
  id           bigint auto_increment
    primary key,
  city         varchar(255) null,
  number_flat  bigint       null,
  number_house bigint       null,
  street       varchar(255) null
);

create table book
(
  id             bigint auto_increment
    primary key,
  count          int          null,
  genre          varchar(255) null,
  number_pages   int          null,
  published_date date         null,
  title          varchar(255) null
);

create table person
(
  person_type varchar(31)  not null,
  id          bigint auto_increment
    primary key,
  first_name  varchar(255) null,
  last_name   varchar(255) null
);

create table author
(
  authors_id bigint not null
    primary key,
  constraint FKd3cjqv8u2bpsv0q8kpt66xtj9
    foreign key (authors_id) references person (id)
);

create table author_book
(
  book_id   bigint not null,
  author_id bigint not null,
  primary key (book_id, author_id),
  constraint FKg7j6ud9d32ll232o9mgo90s57
    foreign key (author_id) references author (authors_id),
  constraint FKn8665s8lv781v4eojs8jo3jao
    foreign key (book_id) references book (id)
);

create table librarian
(
  id bigint not null
    primary key,
  constraint FKmohi0pkgs7r1jwkeb9n6ops8j
    foreign key (id) references person (id)
);

create table reader
(
  phone_number varchar(255) null,
  id           bigint       not null
    primary key,
  address_id   bigint       null,
  constraint FKd5ubuefh9lkoj8vo3wv3oa59t
    foreign key (address_id) references address (id),
  constraint FKdbvpe7vy0psavf0u9ult9n6iy
    foreign key (id) references person (id)
);

create table delivery
(
  id            bigint auto_increment
    primary key,
  delivery_date date   null,
  return_date   date   null,
  book_id       bigint not null,
  librarian_id  bigint not null,
  reader_id     bigint null,
  constraint FK28y1gmmvh0y1yp3knamon1w8t
    foreign key (librarian_id) references librarian (id),
  constraint FK2bktkpy92saltrho6nd4u8fqn
    foreign key (book_id) references book (id),
  constraint FKfrpjmpgln895wi1panytv7kft
    foreign key (reader_id) references reader (id)
);

