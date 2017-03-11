li    $t2,4

li    $t3,3

li    $t4,12

li    $t1,3
mult  $t3,$t1
mflo  $t1
sub   $t1,$t1,$t2
move  $t3,$t1

li    $t1,3
div   $t2,$t1
mflo  $t1
mult  $t3,$t1
mflo  $t1
li    $t0,21
add   $t1,$t1,$t0
move  $t4,$t1

move  $a0,$t4
li    $v0,1
syscall
