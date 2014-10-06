//
//  BARestaurantOrderViewController.m
//  BobaApp
//
//  Created by Brandon Tram on 10/4/14.
//  Copyright (c) 2014 coursera interns. All rights reserved.
//

#import "BARestaurantOrderViewController.h"

@class BARestaurantMenuTableViewCell;

@implementation BARestaurantOrderViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    self.restaurantOrderTableView.delegate = self;
    self.restaurantOrderTableView.dataSource = self;
}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
}

- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
    return 1;
}

- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {
    NSString *const kRestaurantMenuTableViewCellId = @"RestaurantOrderTableViewCell";
    BARestaurantMenuTableViewCell *cell = [tableView dequeueReusableCellWithIdentifier:kRestaurantMenuTableViewCellId];
    return (UITableViewCell *)cell;
}

@end
