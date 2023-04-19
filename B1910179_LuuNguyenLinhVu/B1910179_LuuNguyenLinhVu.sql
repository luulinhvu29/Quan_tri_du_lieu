create table loai(
	idloai int primary key,
    ten varchar(15)
);

create table food(
	id int primary key,
    ten varchar(30),
    idloai int, 
    foreign key (idloai) references loai(idloai),
    gia double,
    donvi varchar(10)
);

CREATE TABLE chucvu(
  idchucvu int primary key,
  tenchucvu varchar(20),
  hesoluong double
);

CREATE TABLE nhanvien(
  idNV int primary key,
  ten varchar(30),
  idchucvu int,
  songaynghi int,
  diachi varchar(50),
  sdt int,
  FOREIGN KEY (idchucvu) REFERENCES chucvu (idchucvu)
);

create table donhang(
	idDH int primary key,
    id int, foreign key (id) references food(id), 
    TenKH varchar(50),
    ngay datetime,
    trangthai varchar(20)
);

create table calam(
	idcalam int primary key,
    hesoluong double,
    giobatdau time,
    gioketthuc time
);

create table lichlamviec(
	thu varchar(10),
    idNV int,
    foreign key (idNV) references nhanvien(idNV),
    idcalam int, 
    foreign key (idcalam) references calam(idcalam)
);

insert into loai values('1', 'Main dish');
insert into loai values('2', 'Appetizer');
insert into loai values('3', 'Dessert');
insert into loai values('4', 'Drink');


DELIMITER $$;
create procedure addfood(id int, ten varchar(30), idLoai int, gia double, donvi varchar(10))
begin
	insert into food values(id,ten,idloai,gia,donvi);
end$$;

call addfood(1, 'Bun dau mam tom', 1, 30000, 'Phan');
call addfood(2, 'Ca phe', 4, 10000, 'Ly');
call addfood(3, 'Kem vani', 3, 15000, 'Cay');
call addfood(4, 'Rau Cau', 2, 5000, 'Cai');

insert into chucvu values('1', 'Quan ly', '4');
insert into chucvu values('2', 'Dau bep', '3.5');
insert into chucvu values('3', 'Phu bep', '3');
insert into chucvu values('4', 'Phu vu', '2');

insert into nhanvien values(1, 'Nguyen Van A', 1, 5, 'Can Tho', 123456789);
insert into nhanvien values(2, 'Tran Thi B', 3, 2, 'Tien Giang', 909090909);
insert into nhanvien values(3, 'Alex Kakaka', 2, 3, 'USA', 21212345);
insert into nhanvien values(4, 'Lam Van C', 4, 2, 'Vinh Long', 909011111);

insert into calam values(1,1.0,70000,113000);
insert into calam values(2,1.2,113000,160000);
insert into calam values(3,1.5,160000,210000);

insert into lichlamviec values('2',1,1);
insert into lichlamviec values('2',2,1);
insert into lichlamviec values('3',3,2);
insert into lichlamviec values('4',2,1);
insert into lichlamviec values('5',3,3);
insert into lichlamviec values('6',4,2);
insert into lichlamviec values('7',4,1);
insert into lichlamviec values('chu nhat',4,2);
insert into lichlamviec values('5',3,2);
insert into lichlamviec values('4',3,3);

insert into donhang values(1,1,'ABC',20220506170000,'chua hoan thanh');
call adddonhang(iddh,1,'ABC',20220506170000);

call hoanthanh(1);
drop procedure adddonhang;
DELIMITER $$
CREATE PROCEDURE adddonhang(iddh int,id int, tenKH varchar(50), ngay datetime)
begin
	declare n int default (select max(iddh) from donhang); 
	insert into donhang values (n+1,id,tenKH,ngay,'chua hoan thanh');
end$$


DELIMITER $$;
create procedure hoanthanh(id int)
begin
	update donhang set trangthai = 'hoan thanh' where id=donhang.idDH;
end$$;


DELIMITER $$;
create procedure huydonhang(id int)
begin
	delete from donhang where id=donhang.idDH;
end$$;

DELIMITER $$;
create procedure addlichlamviec(thu varchar(10), idNV int, idcalam int)
begin
	insert into lichlamviec values(thu,idNV,idcalam);
end$$;

DELIMITER $$;
create procedure nghiphep(id int, thu varchar(10))
begin
	delete from lichlamviec where id=lichlamviec.idNV and thu=lichlamviec.thu;
    update nhanvien set nhanvien.songaynghi=nhanvien.songaynghi+1;
end$$;

DELIMITER $$;
create procedure deletefood(id int)
begin
	delete from food where id=food.id;
end$$;

DELIMITER $$;
create procedure sathai(id int)
begin
	delete from nhanvien where id=nhanvien.idNV;
end$$;

DELIMITER $$;
create procedure addnhanvien(idnv int, ten varchar (50), idcv int, diachi varchar(50), sdt int)
begin
	insert into nhanvien values(idnv, ten, idcv, 0,diachi, sdt);
end$$;


DELIMITER $$;
create procedure tinhluong1nguoi(id int)
begin
    select n.idnv, n.ten as tennhanvien, sum(c.hesoluong)*cv.hesoluong*1000000 as luong from lichlamviec l, calam c, nhanvien n, chucvu cv
    where c.idcalam=l.idcalam and n.idnv=id and l.idnv=id and n.idchucvu=cv.idchucvu;
end$$;


