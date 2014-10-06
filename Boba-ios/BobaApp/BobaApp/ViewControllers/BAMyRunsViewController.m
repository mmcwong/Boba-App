//
//  BAMyRunViewController.m
//  BobaApp
//
//  Created by Hyun Bin Kim on 2014-10-04.
//  Copyright (c) 2014 coursera interns. All rights reserved.
//

#import "BAMyRunsViewController.h"
#import "Helpers.h"

@class BARestaurantSearchViewController, BAMyRunsTableViewCell;

@implementation BAMyRunsViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    self.myRunsTableView.delegate = self;
    self.myRunsTableView.dataSource = self;
}

- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
    return 1;
}

- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {
    NSString *const kMyRunsTableViewCellId = @"MyRunsTableViewCell";
    BAMyRunsTableViewCell *cell = [tableView dequeueReusableCellWithIdentifier:kMyRunsTableViewCellId];
    return (UITableViewCell *)cell;
}

@end
